# Librerie JNI per Manatee - istruzioni

Per creare il `.jar` contenente i file per connettersi alla libreria JNI di Manatee:

* Scegliere la branch corrispondente alla versione di SWIG utilizzata
* `mvn package`
* ` mvn install:install-file -Dfile=./target/manatee-jni-1.0-SNAPSHOT.jar -Dpackaging=jar -DgeneratePom=true -DgroupId=com.sketchengine.manatee -DartifactId=manatee-jni -Dversion=1.0-SNAPSHOT`

Questi comandi installano la libreria nel repository locale maven. In questo modo il progetto ImpaqtsWrapper può trovare la dipendenza.