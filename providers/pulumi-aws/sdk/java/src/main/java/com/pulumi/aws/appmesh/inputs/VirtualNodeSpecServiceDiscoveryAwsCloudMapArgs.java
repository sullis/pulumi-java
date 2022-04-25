// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs Empty = new VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs();

    /**
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<Map<String,String>> attributes;

    /**
     * @return A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
     * 
     */
    public Optional<Output<Map<String,String>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * The name of the AWS Cloud Map namespace to use.
     * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The name of the AWS Cloud Map namespace to use.
     * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs() {}

    private VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs(VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs $) {
        this.attributes = $.attributes;
        this.namespaceName = $.namespaceName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs $;

        public Builder() {
            $ = new VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs();
        }

        public Builder(VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs defaults) {
            $ = new VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributes A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
         * 
         * @return builder
         * 
         */
        public Builder attributes(Map<String,String> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param namespaceName The name of the AWS Cloud Map namespace to use.
         * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The name of the AWS Cloud Map namespace to use.
         * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param serviceName The name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
