// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewayArgs Empty = new VirtualGatewayArgs();

    /**
     * The name of the service mesh in which to create the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="meshName", required=true)
    private Output<String> meshName;

    /**
     * @return The name of the service mesh in which to create the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> meshName() {
        return this.meshName;
    }

    /**
     * The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @Import(name="meshOwner")
    private @Nullable Output<String> meshOwner;

    /**
     * @return The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    public Optional<Output<String>> meshOwner() {
        return Optional.ofNullable(this.meshOwner);
    }

    /**
     * The name to use for the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to use for the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The virtual gateway specification to apply.
     * 
     */
    @Import(name="spec", required=true)
    private Output<VirtualGatewaySpecArgs> spec;

    /**
     * @return The virtual gateway specification to apply.
     * 
     */
    public Output<VirtualGatewaySpecArgs> spec() {
        return this.spec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private VirtualGatewayArgs() {}

    private VirtualGatewayArgs(VirtualGatewayArgs $) {
        this.meshName = $.meshName;
        this.meshOwner = $.meshOwner;
        this.name = $.name;
        this.spec = $.spec;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewayArgs $;

        public Builder() {
            $ = new VirtualGatewayArgs();
        }

        public Builder(VirtualGatewayArgs defaults) {
            $ = new VirtualGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param meshName The name of the service mesh in which to create the virtual gateway. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder meshName(Output<String> meshName) {
            $.meshName = meshName;
            return this;
        }

        /**
         * @param meshName The name of the service mesh in which to create the virtual gateway. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder meshName(String meshName) {
            return meshName(Output.of(meshName));
        }

        /**
         * @param meshOwner The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
         * 
         * @return builder
         * 
         */
        public Builder meshOwner(@Nullable Output<String> meshOwner) {
            $.meshOwner = meshOwner;
            return this;
        }

        /**
         * @param meshOwner The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
         * 
         * @return builder
         * 
         */
        public Builder meshOwner(String meshOwner) {
            return meshOwner(Output.of(meshOwner));
        }

        /**
         * @param name The name to use for the virtual gateway. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to use for the virtual gateway. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param spec The virtual gateway specification to apply.
         * 
         * @return builder
         * 
         */
        public Builder spec(Output<VirtualGatewaySpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The virtual gateway specification to apply.
         * 
         * @return builder
         * 
         */
        public Builder spec(VirtualGatewaySpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public VirtualGatewayArgs build() {
            $.meshName = Objects.requireNonNull($.meshName, "expected parameter 'meshName' to be non-null");
            $.spec = Objects.requireNonNull($.spec, "expected parameter 'spec' to be non-null");
            return $;
        }
    }

}
