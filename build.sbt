name := "ayumi-model"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

val silhouetteVer = "5.0.0-RC2"

libraryDependencies ++= Seq(
  "com.iheart"              %% "ficus"                            % "1.4.1",        // config lib, used by Silhouette,
  "com.mohiva"              %% "play-silhouette"                  % silhouetteVer,
  "com.mohiva"              %% "play-silhouette"                  % silhouetteVer,
  "com.mohiva"              %% "play-silhouette-password-bcrypt"  % silhouetteVer,
  "com.mohiva"              %% "play-silhouette-crypto-jca"       % silhouetteVer,
  "com.mohiva"              %% "play-silhouette-persistence"      % silhouetteVer,
  "com.mohiva"              %% "play-silhouette-testkit"          % silhouetteVer   % "test"
)