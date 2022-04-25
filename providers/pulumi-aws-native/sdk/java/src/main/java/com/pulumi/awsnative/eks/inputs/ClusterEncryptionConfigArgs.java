// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks.inputs;

import com.pulumi.awsnative.eks.inputs.ClusterEncryptionConfigProviderPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the cluster
 * 
 */
public final class ClusterEncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionConfigArgs Empty = new ClusterEncryptionConfigArgs();

    /**
     * The encryption provider for the cluster.
     * 
     */
    @Import(name="provider")
    private @Nullable Output<ClusterEncryptionConfigProviderPropertiesArgs> provider;

    /**
     * @return The encryption provider for the cluster.
     * 
     */
    public Optional<Output<ClusterEncryptionConfigProviderPropertiesArgs>> provider() {
        return Optional.ofNullable(this.provider);
    }

    /**
     * Specifies the resources to be encrypted. The only supported value is &#34;secrets&#34;.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return Specifies the resources to be encrypted. The only supported value is &#34;secrets&#34;.
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    private ClusterEncryptionConfigArgs() {}

    private ClusterEncryptionConfigArgs(ClusterEncryptionConfigArgs $) {
        this.provider = $.provider;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEncryptionConfigArgs $;

        public Builder() {
            $ = new ClusterEncryptionConfigArgs();
        }

        public Builder(ClusterEncryptionConfigArgs defaults) {
            $ = new ClusterEncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param provider The encryption provider for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder provider(@Nullable Output<ClusterEncryptionConfigProviderPropertiesArgs> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider The encryption provider for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder provider(ClusterEncryptionConfigProviderPropertiesArgs provider) {
            return provider(Output.of(provider));
        }

        /**
         * @param resources Specifies the resources to be encrypted. The only supported value is &#34;secrets&#34;.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources Specifies the resources to be encrypted. The only supported value is &#34;secrets&#34;.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources Specifies the resources to be encrypted. The only supported value is &#34;secrets&#34;.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public ClusterEncryptionConfigArgs build() {
            return $;
        }
    }

}
