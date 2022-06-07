// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFleetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFleetArgs Empty = new GetFleetArgs();

    /**
     * Unique fleet ID
     * 
     */
    @Import(name="fleetId", required=true)
    private Output<String> fleetId;

    /**
     * @return Unique fleet ID
     * 
     */
    public Output<String> fleetId() {
        return this.fleetId;
    }

    private GetFleetArgs() {}

    private GetFleetArgs(GetFleetArgs $) {
        this.fleetId = $.fleetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFleetArgs $;

        public Builder() {
            $ = new GetFleetArgs();
        }

        public Builder(GetFleetArgs defaults) {
            $ = new GetFleetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fleetId Unique fleet ID
         * 
         * @return builder
         * 
         */
        public Builder fleetId(Output<String> fleetId) {
            $.fleetId = fleetId;
            return this;
        }

        /**
         * @param fleetId Unique fleet ID
         * 
         * @return builder
         * 
         */
        public Builder fleetId(String fleetId) {
            return fleetId(Output.of(fleetId));
        }

        public GetFleetArgs build() {
            $.fleetId = Objects.requireNonNull($.fleetId, "expected parameter 'fleetId' to be non-null");
            return $;
        }
    }

}
