// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotfleethub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationArgs Empty = new GetApplicationArgs();

    /**
     * The ID of the application.
     * 
     */
    @Import(name="applicationId", required=true)
      private final String applicationId;

    public String applicationId() {
        return this.applicationId;
    }

    public GetApplicationArgs(String applicationId) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
    }

    private GetApplicationArgs() {
        this.applicationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
        }

        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }        public GetApplicationArgs build() {
            return new GetApplicationArgs(applicationId);
        }
    }
}
