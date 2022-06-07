// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcEndpointServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcEndpointServiceArgs Empty = new GetVpcEndpointServiceArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetVpcEndpointServiceFilterArgs>> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<Output<List<GetVpcEndpointServiceFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The common name of an AWS service (e.g., `s3`).
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The common name of an AWS service (e.g., `s3`).
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * The service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * The service type, `Gateway` or `Interface`.
     * 
     */
    @Import(name="serviceType")
    private @Nullable Output<String> serviceType;

    /**
     * @return The service type, `Gateway` or `Interface`.
     * 
     */
    public Optional<Output<String>> serviceType() {
        return Optional.ofNullable(this.serviceType);
    }

    /**
     * A map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetVpcEndpointServiceArgs() {}

    private GetVpcEndpointServiceArgs(GetVpcEndpointServiceArgs $) {
        this.filters = $.filters;
        this.service = $.service;
        this.serviceName = $.serviceName;
        this.serviceType = $.serviceType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcEndpointServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcEndpointServiceArgs $;

        public Builder() {
            $ = new GetVpcEndpointServiceArgs();
        }

        public Builder(GetVpcEndpointServiceArgs defaults) {
            $ = new GetVpcEndpointServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetVpcEndpointServiceFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetVpcEndpointServiceFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVpcEndpointServiceFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param service The common name of an AWS service (e.g., `s3`).
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The common name of an AWS service (e.g., `s3`).
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param serviceName The service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param serviceType The service type, `Gateway` or `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder serviceType(@Nullable Output<String> serviceType) {
            $.serviceType = serviceType;
            return this;
        }

        /**
         * @param serviceType The service type, `Gateway` or `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder serviceType(String serviceType) {
            return serviceType(Output.of(serviceType));
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetVpcEndpointServiceArgs build() {
            return $;
        }
    }

}
