# Ignition SDK Maven Archetypes
Maven archetypes for generating various Ignition module skeleton projects.

### Client + Designer + Gateway Module
A module that will load hooks into all three scopes.

```
mvn archetype:generate \
-DarchetypeGroupId=com.inductiveautomation.ignitionsdk \
-DarchetypeArtifactId=client-designer-gateway-archetype \
-DarchetypeVersion=1.2.1
```

### OPC UA Device Module
A module that will provide a new device type for Ignition's OPC UA server.

```
mvn archetype:generate \
-DarchetypeGroupId=com.inductiveautomation.ignitionsdk \
-DarchetypeArtifactId=opc-ua-device-archetype \
-DarchetypeVersion=1.2.1
```

### Perspective Component Module
A module that will provide new components to Ignition's Perspective visualization module.  

```
mvn archetype:generate \
-DarchetypeGroupId=com.inductiveautomation.ignitionsdk \
-DarchetypeArtifactId=perspective-component-archetype \
-DarchetypeVersion=1.2.1
```

### Module for All Scopes
A module that will provide new components to Ignition's Perspective visualization module.

```
mvn archetype:generate \
-DarchetypeGroupId=com.inductiveautomation.ignitionsdk \
-DarchetypeArtifactId=all-scopes-archetype \
-DarchetypeVersion=1.2.1
```
