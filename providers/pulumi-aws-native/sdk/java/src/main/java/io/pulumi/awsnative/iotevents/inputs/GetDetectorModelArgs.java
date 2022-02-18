// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDetectorModelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDetectorModelArgs Empty = new GetDetectorModelArgs();

    /**
     * The name of the detector model.
     * 
     */
    @InputImport(name="detectorModelName", required=true)
    private final String detectorModelName;

    public String getDetectorModelName() {
        return this.detectorModelName;
    }

    public GetDetectorModelArgs(String detectorModelName) {
        this.detectorModelName = Objects.requireNonNull(detectorModelName, "expected parameter 'detectorModelName' to be non-null");
    }

    private GetDetectorModelArgs() {
        this.detectorModelName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDetectorModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String detectorModelName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDetectorModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectorModelName = defaults.detectorModelName;
        }

        public Builder setDetectorModelName(String detectorModelName) {
            this.detectorModelName = Objects.requireNonNull(detectorModelName);
            return this;
        }

        public GetDetectorModelArgs build() {
            return new GetDetectorModelArgs(detectorModelName);
        }
    }
}
