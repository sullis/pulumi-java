// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.UserAssignedIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedClusterPodIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterPodIdentityArgs Empty = new ManagedClusterPodIdentityArgs();

    /**
     * Binding selector to use for the AzureIdentityBinding resource.
     * 
     */
    @InputImport(name="bindingSelector")
    private final @Nullable Input<String> bindingSelector;

    public Input<String> getBindingSelector() {
        return this.bindingSelector == null ? Input.empty() : this.bindingSelector;
    }

    /**
     * Information of the user assigned identity.
     * 
     */
    @InputImport(name="identity", required=true)
    private final Input<UserAssignedIdentityArgs> identity;

    public Input<UserAssignedIdentityArgs> getIdentity() {
        return this.identity;
    }

    /**
     * Name of the pod identity.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Namespace of the pod identity.
     * 
     */
    @InputImport(name="namespace", required=true)
    private final Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace;
    }

    public ManagedClusterPodIdentityArgs(
        @Nullable Input<String> bindingSelector,
        Input<UserAssignedIdentityArgs> identity,
        Input<String> name,
        Input<String> namespace) {
        this.bindingSelector = bindingSelector;
        this.identity = Objects.requireNonNull(identity, "expected parameter 'identity' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private ManagedClusterPodIdentityArgs() {
        this.bindingSelector = Input.empty();
        this.identity = Input.empty();
        this.name = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPodIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bindingSelector;
        private Input<UserAssignedIdentityArgs> identity;
        private Input<String> name;
        private Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPodIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindingSelector = defaults.bindingSelector;
    	      this.identity = defaults.identity;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setBindingSelector(@Nullable Input<String> bindingSelector) {
            this.bindingSelector = bindingSelector;
            return this;
        }

        public Builder setBindingSelector(@Nullable String bindingSelector) {
            this.bindingSelector = Input.ofNullable(bindingSelector);
            return this;
        }

        public Builder setIdentity(Input<UserAssignedIdentityArgs> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setIdentity(UserAssignedIdentityArgs identity) {
            this.identity = Input.of(Objects.requireNonNull(identity));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNamespace(Input<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }

        public ManagedClusterPodIdentityArgs build() {
            return new ManagedClusterPodIdentityArgs(bindingSelector, identity, name, namespace);
        }
    }
}
