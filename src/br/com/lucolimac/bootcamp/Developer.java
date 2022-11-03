package br.com.lucolimac.bootcamp;

import java.util.*;

public class Developer {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevelopers().add(this);
    }

    public void toProgress() {
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if(content.isPresent()) {
            this.completedContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp() {
        Iterator<Content> iterator = this.completedContents.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calculateXp();
            soma += next;
        }
        return soma;

        /*return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();*/
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(subscribedContents, developer.subscribedContents) && Objects.equals(completedContents, developer.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, completedContents);
    }
}
