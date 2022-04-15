// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocationFSxWindowsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocationFSxWindowsArgs Empty = new GetLocationFSxWindowsArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
     * 
     */
    @Import(name="locationArn", required=true)
      private final String locationArn;

    public String locationArn() {
        return this.locationArn;
    }

    public GetLocationFSxWindowsArgs(String locationArn) {
        this.locationArn = Objects.requireNonNull(locationArn, "expected parameter 'locationArn' to be non-null");
    }

    private GetLocationFSxWindowsArgs() {
        this.locationArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationFSxWindowsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String locationArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationFSxWindowsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationArn = defaults.locationArn;
        }

        public Builder locationArn(String locationArn) {
            this.locationArn = Objects.requireNonNull(locationArn);
            return this;
        }        public GetLocationFSxWindowsArgs build() {
            return new GetLocationFSxWindowsArgs(locationArn);
        }
    }
}
