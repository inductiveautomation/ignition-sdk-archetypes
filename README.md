# Ignition SDK Maven Archetypes
Maven archetypes for generating various Ignition module skeleton projects.

### Client + Designer + Gateway Module
A module that will load hooks into all three scopes.

```
mvn archetype:generate \
-DarchetypeGroupId=com.inductiveautomation.ignitionsdk \
-DarchetypeArtifactId=client-designer-gateway-archetype \
-DarchetypeVersion=1.0.2
```

### OPC-UA Driver Module
A module that will provide a new driver type for Ignition's OPC-UA server.

```
mvn archetype:generate \
-DarchetypeGroupId=com.inductiveautomation.ignitionsdk \
-DarchetypeArtifactId=opc-ua-driver-archetype \
-DarchetypeVersion=1.0.2
```
