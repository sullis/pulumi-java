// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for a serverless network endpoint group (NEG). The platform must be provided. Note: The target backend service must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupServerlessDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupServerlessDeploymentArgs Empty = new NetworkEndpointGroupServerlessDeploymentArgs();

    /**
     * The platform of the backend target(s) of this NEG. Possible values include: 1. API Gateway: apigateway.googleapis.com 2. App Engine: appengine.googleapis.com 3. Cloud Functions: cloudfunctions.googleapis.com 4. Cloud Run: run.googleapis.com
     * 
     */
    @Import(name="platform")
    private @Nullable Output<String> platform;

    /**
     * @return The platform of the backend target(s) of this NEG. Possible values include: 1. API Gateway: apigateway.googleapis.com 2. App Engine: appengine.googleapis.com 3. Cloud Functions: cloudfunctions.googleapis.com 4. Cloud Run: run.googleapis.com
     * 
     */
    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
     * 
     */
    @Import(name="urlMask")
    private @Nullable Output<String> urlMask;

    /**
     * @return A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
     * 
     */
    public Optional<Output<String>> urlMask() {
        return Optional.ofNullable(this.urlMask);
    }

    /**
     * The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private NetworkEndpointGroupServerlessDeploymentArgs() {}

    private NetworkEndpointGroupServerlessDeploymentArgs(NetworkEndpointGroupServerlessDeploymentArgs $) {
        this.platform = $.platform;
        this.resource = $.resource;
        this.urlMask = $.urlMask;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkEndpointGroupServerlessDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkEndpointGroupServerlessDeploymentArgs $;

        public Builder() {
            $ = new NetworkEndpointGroupServerlessDeploymentArgs();
        }

        public Builder(NetworkEndpointGroupServerlessDeploymentArgs defaults) {
            $ = new NetworkEndpointGroupServerlessDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param platform The platform of the backend target(s) of this NEG. Possible values include: 1. API Gateway: apigateway.googleapis.com 2. App Engine: appengine.googleapis.com 3. Cloud Functions: cloudfunctions.googleapis.com 4. Cloud Run: run.googleapis.com
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform The platform of the backend target(s) of this NEG. Possible values include: 1. API Gateway: apigateway.googleapis.com 2. App Engine: appengine.googleapis.com 3. Cloud Functions: cloudfunctions.googleapis.com 4. Cloud Run: run.googleapis.com
         * 
         * @return builder
         * 
         */
        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param resource The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param urlMask A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
         * 
         * @return builder
         * 
         */
        public Builder urlMask(@Nullable Output<String> urlMask) {
            $.urlMask = urlMask;
            return this;
        }

        /**
         * @param urlMask A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
         * 
         * @return builder
         * 
         */
        public Builder urlMask(String urlMask) {
            return urlMask(Output.of(urlMask));
        }

        /**
         * @param version The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public NetworkEndpointGroupServerlessDeploymentArgs build() {
            return $;
        }
    }

}
