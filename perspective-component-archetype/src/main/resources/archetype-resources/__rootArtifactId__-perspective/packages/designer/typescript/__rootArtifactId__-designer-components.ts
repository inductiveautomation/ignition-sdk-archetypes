import {ComponentMeta, ComponentRegistry} from '@inductiveautomation/perspective-client';

// export so the components are referencable
export {};

// as new components are implemented, import them, and add their meta to this array
const components: Array<ComponentMeta> = [
    // list components to export here
];

// iterate through our components, registering each one with the registry.  Don't forget to register on the Java side too!
components.forEach((c: ComponentMeta) => ComponentRegistry.register(c) );
