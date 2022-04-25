// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.ConfigMapKeySelectorArgs;
import com.pulumi.kubernetes.core_v1.inputs.ObjectFieldSelectorArgs;
import com.pulumi.kubernetes.core_v1.inputs.ResourceFieldSelectorArgs;
import com.pulumi.kubernetes.core_v1.inputs.SecretKeySelectorArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EnvVarSource represents a source for the value of an EnvVar.
 * 
 */
public final class EnvVarSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvVarSourceArgs Empty = new EnvVarSourceArgs();

    /**
     * Selects a key of a ConfigMap.
     * 
     */
    @Import(name="configMapKeyRef")
    private @Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef;

    /**
     * @return Selects a key of a ConfigMap.
     * 
     */
    public Optional<Output<ConfigMapKeySelectorArgs>> configMapKeyRef() {
        return Optional.ofNullable(this.configMapKeyRef);
    }

    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels[&#39;&lt;KEY&gt;&#39;]`, `metadata.annotations[&#39;&lt;KEY&gt;&#39;]`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
     */
    @Import(name="fieldRef")
    private @Nullable Output<ObjectFieldSelectorArgs> fieldRef;

    /**
     * @return Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels[&#39;&lt;KEY&gt;&#39;]`, `metadata.annotations[&#39;&lt;KEY&gt;&#39;]`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
     */
    public Optional<Output<ObjectFieldSelectorArgs>> fieldRef() {
        return Optional.ofNullable(this.fieldRef);
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
     */
    @Import(name="resourceFieldRef")
    private @Nullable Output<ResourceFieldSelectorArgs> resourceFieldRef;

    /**
     * @return Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
     */
    public Optional<Output<ResourceFieldSelectorArgs>> resourceFieldRef() {
        return Optional.ofNullable(this.resourceFieldRef);
    }

    /**
     * Selects a key of a secret in the pod&#39;s namespace
     * 
     */
    @Import(name="secretKeyRef")
    private @Nullable Output<SecretKeySelectorArgs> secretKeyRef;

    /**
     * @return Selects a key of a secret in the pod&#39;s namespace
     * 
     */
    public Optional<Output<SecretKeySelectorArgs>> secretKeyRef() {
        return Optional.ofNullable(this.secretKeyRef);
    }

    private EnvVarSourceArgs() {}

    private EnvVarSourceArgs(EnvVarSourceArgs $) {
        this.configMapKeyRef = $.configMapKeyRef;
        this.fieldRef = $.fieldRef;
        this.resourceFieldRef = $.resourceFieldRef;
        this.secretKeyRef = $.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvVarSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvVarSourceArgs $;

        public Builder() {
            $ = new EnvVarSourceArgs();
        }

        public Builder(EnvVarSourceArgs defaults) {
            $ = new EnvVarSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configMapKeyRef Selects a key of a ConfigMap.
         * 
         * @return builder
         * 
         */
        public Builder configMapKeyRef(@Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef) {
            $.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
         * @param configMapKeyRef Selects a key of a ConfigMap.
         * 
         * @return builder
         * 
         */
        public Builder configMapKeyRef(ConfigMapKeySelectorArgs configMapKeyRef) {
            return configMapKeyRef(Output.of(configMapKeyRef));
        }

        /**
         * @param fieldRef Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels[&#39;&lt;KEY&gt;&#39;]`, `metadata.annotations[&#39;&lt;KEY&gt;&#39;]`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
         * 
         * @return builder
         * 
         */
        public Builder fieldRef(@Nullable Output<ObjectFieldSelectorArgs> fieldRef) {
            $.fieldRef = fieldRef;
            return this;
        }

        /**
         * @param fieldRef Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels[&#39;&lt;KEY&gt;&#39;]`, `metadata.annotations[&#39;&lt;KEY&gt;&#39;]`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
         * 
         * @return builder
         * 
         */
        public Builder fieldRef(ObjectFieldSelectorArgs fieldRef) {
            return fieldRef(Output.of(fieldRef));
        }

        /**
         * @param resourceFieldRef Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
         * 
         * @return builder
         * 
         */
        public Builder resourceFieldRef(@Nullable Output<ResourceFieldSelectorArgs> resourceFieldRef) {
            $.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * @param resourceFieldRef Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
         * 
         * @return builder
         * 
         */
        public Builder resourceFieldRef(ResourceFieldSelectorArgs resourceFieldRef) {
            return resourceFieldRef(Output.of(resourceFieldRef));
        }

        /**
         * @param secretKeyRef Selects a key of a secret in the pod&#39;s namespace
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(@Nullable Output<SecretKeySelectorArgs> secretKeyRef) {
            $.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * @param secretKeyRef Selects a key of a secret in the pod&#39;s namespace
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(SecretKeySelectorArgs secretKeyRef) {
            return secretKeyRef(Output.of(secretKeyRef));
        }

        public EnvVarSourceArgs build() {
            return $;
        }
    }

}
