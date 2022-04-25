// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceGetArgs();

    /**
     * The client policy for the backend.
     * 
     */
    @Import(name="clientPolicy")
    private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs> clientPolicy;

    /**
     * @return The client policy for the backend.
     * 
     */
    public Optional<Output<VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs>> clientPolicy() {
        return Optional.ofNullable(this.clientPolicy);
    }

    /**
     * The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualServiceName", required=true)
    private Output<String> virtualServiceName;

    /**
     * @return The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> virtualServiceName() {
        return this.virtualServiceName;
    }

    private VirtualNodeSpecBackendVirtualServiceGetArgs() {}

    private VirtualNodeSpecBackendVirtualServiceGetArgs(VirtualNodeSpecBackendVirtualServiceGetArgs $) {
        this.clientPolicy = $.clientPolicy;
        this.virtualServiceName = $.virtualServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendVirtualServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendVirtualServiceGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendVirtualServiceGetArgs();
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceGetArgs defaults) {
            $ = new VirtualNodeSpecBackendVirtualServiceGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientPolicy The client policy for the backend.
         * 
         * @return builder
         * 
         */
        public Builder clientPolicy(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs> clientPolicy) {
            $.clientPolicy = clientPolicy;
            return this;
        }

        /**
         * @param clientPolicy The client policy for the backend.
         * 
         * @return builder
         * 
         */
        public Builder clientPolicy(VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs clientPolicy) {
            return clientPolicy(Output.of(clientPolicy));
        }

        /**
         * @param virtualServiceName The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualServiceName(Output<String> virtualServiceName) {
            $.virtualServiceName = virtualServiceName;
            return this;
        }

        /**
         * @param virtualServiceName The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualServiceName(String virtualServiceName) {
            return virtualServiceName(Output.of(virtualServiceName));
        }

        public VirtualNodeSpecBackendVirtualServiceGetArgs build() {
            $.virtualServiceName = Objects.requireNonNull($.virtualServiceName, "expected parameter 'virtualServiceName' to be non-null");
            return $;
        }
    }

}
