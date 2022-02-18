// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerDestinationCloudRunServiceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerDestinationCloudRunServiceGetArgs Empty = new TriggerDestinationCloudRunServiceGetArgs();

    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: "/route", "route", "route/subroute".
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Required. The region the Cloud Run service is deployed in.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Required. The name of the Cloud Run service being addressed. See https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services. Only services located in the same project of the trigger object can be addressed.
     * 
     */
    @InputImport(name="service", required=true)
    private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    public TriggerDestinationCloudRunServiceGetArgs(
        @Nullable Input<String> path,
        @Nullable Input<String> region,
        Input<String> service) {
        this.path = path;
        this.region = region;
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private TriggerDestinationCloudRunServiceGetArgs() {
        this.path = Input.empty();
        this.region = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDestinationCloudRunServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> path;
        private @Nullable Input<String> region;
        private Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDestinationCloudRunServiceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.region = defaults.region;
    	      this.service = defaults.service;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setService(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setService(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }

        public TriggerDestinationCloudRunServiceGetArgs build() {
            return new TriggerDestinationCloudRunServiceGetArgs(path, region, service);
        }
    }
}
