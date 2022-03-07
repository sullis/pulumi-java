// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.LineRegistrationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * The parameters to provide for the Line channel.
 * 
 */
public final class LineChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LineChannelPropertiesArgs Empty = new LineChannelPropertiesArgs();

    /**
     * The list of line channel registrations
     * 
     */
    @InputImport(name="lineRegistrations", required=true)
      private final Input<List<LineRegistrationArgs>> lineRegistrations;

    public Input<List<LineRegistrationArgs>> getLineRegistrations() {
        return this.lineRegistrations;
    }

    public LineChannelPropertiesArgs(Input<List<LineRegistrationArgs>> lineRegistrations) {
        this.lineRegistrations = Objects.requireNonNull(lineRegistrations, "expected parameter 'lineRegistrations' to be non-null");
    }

    private LineChannelPropertiesArgs() {
        this.lineRegistrations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LineChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<LineRegistrationArgs>> lineRegistrations;

        public Builder() {
    	      // Empty
        }

        public Builder(LineChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lineRegistrations = defaults.lineRegistrations;
        }

        public Builder setLineRegistrations(Input<List<LineRegistrationArgs>> lineRegistrations) {
            this.lineRegistrations = Objects.requireNonNull(lineRegistrations);
            return this;
        }

        public Builder setLineRegistrations(List<LineRegistrationArgs> lineRegistrations) {
            this.lineRegistrations = Input.of(Objects.requireNonNull(lineRegistrations));
            return this;
        }
        public LineChannelPropertiesArgs build() {
            return new LineChannelPropertiesArgs(lineRegistrations);
        }
    }
}