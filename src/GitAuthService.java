

public class GitAuthService{

Github github = new RtGithub("reenaramanadham", "apoorva16");
Repo repo = github.repos().create(
  Json.createObjectBuilder().add("name", "repo-name").build()
);



}

