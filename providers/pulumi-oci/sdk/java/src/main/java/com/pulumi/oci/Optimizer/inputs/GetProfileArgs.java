// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProfileArgs Empty = new GetProfileArgs();

    /**
     * The unique OCID of the profile.
     * 
     */
    @Import(name="profileId", required=true)
    private Output<String> profileId;

    /**
     * @return The unique OCID of the profile.
     * 
     */
    public Output<String> profileId() {
        return this.profileId;
    }

    private GetProfileArgs() {}

    private GetProfileArgs(GetProfileArgs $) {
        this.profileId = $.profileId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProfileArgs $;

        public Builder() {
            $ = new GetProfileArgs();
        }

        public Builder(GetProfileArgs defaults) {
            $ = new GetProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param profileId The unique OCID of the profile.
         * 
         * @return builder
         * 
         */
        public Builder profileId(Output<String> profileId) {
            $.profileId = profileId;
            return this;
        }

        /**
         * @param profileId The unique OCID of the profile.
         * 
         * @return builder
         * 
         */
        public Builder profileId(String profileId) {
            return profileId(Output.of(profileId));
        }

        public GetProfileArgs build() {
            $.profileId = Objects.requireNonNull($.profileId, "expected parameter 'profileId' to be non-null");
            return $;
        }
    }

}
