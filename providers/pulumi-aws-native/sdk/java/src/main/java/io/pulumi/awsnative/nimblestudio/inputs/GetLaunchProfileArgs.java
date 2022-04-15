// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchProfileArgs Empty = new GetLaunchProfileArgs();

    @Import(name="launchProfileId", required=true)
      private final String launchProfileId;

    public String launchProfileId() {
        return this.launchProfileId;
    }

    /**
     * <p>The studio ID. </p>
     * 
     */
    @Import(name="studioId", required=true)
      private final String studioId;

    public String studioId() {
        return this.studioId;
    }

    public GetLaunchProfileArgs(
        String launchProfileId,
        String studioId) {
        this.launchProfileId = Objects.requireNonNull(launchProfileId, "expected parameter 'launchProfileId' to be non-null");
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
    }

    private GetLaunchProfileArgs() {
        this.launchProfileId = null;
        this.studioId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String launchProfileId;
        private String studioId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchProfileId = defaults.launchProfileId;
    	      this.studioId = defaults.studioId;
        }

        public Builder launchProfileId(String launchProfileId) {
            this.launchProfileId = Objects.requireNonNull(launchProfileId);
            return this;
        }
        public Builder studioId(String studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }        public GetLaunchProfileArgs build() {
            return new GetLaunchProfileArgs(launchProfileId, studioId);
        }
    }
}
