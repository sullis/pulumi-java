// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configures the Explicit Analog Television Output Restriction control bits. For further details see the PlayReady Compliance Rules.
 * 
 */
public final class ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs Empty = new ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs();

    /**
     * Indicates whether this restriction is enforced on a Best Effort basis.
     * 
     */
    @Import(name="bestEffort", required=true)
    private Output<Boolean> bestEffort;

    /**
     * @return Indicates whether this restriction is enforced on a Best Effort basis.
     * 
     */
    public Output<Boolean> bestEffort() {
        return this.bestEffort;
    }

    /**
     * Configures the restriction control bits. Must be between 0 and 3 inclusive.
     * 
     */
    @Import(name="configurationData", required=true)
    private Output<Integer> configurationData;

    /**
     * @return Configures the restriction control bits. Must be between 0 and 3 inclusive.
     * 
     */
    public Output<Integer> configurationData() {
        return this.configurationData;
    }

    private ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs() {}

    private ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs $) {
        this.bestEffort = $.bestEffort;
        this.configurationData = $.configurationData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs $;

        public Builder() {
            $ = new ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs();
        }

        public Builder(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs defaults) {
            $ = new ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bestEffort Indicates whether this restriction is enforced on a Best Effort basis.
         * 
         * @return builder
         * 
         */
        public Builder bestEffort(Output<Boolean> bestEffort) {
            $.bestEffort = bestEffort;
            return this;
        }

        /**
         * @param bestEffort Indicates whether this restriction is enforced on a Best Effort basis.
         * 
         * @return builder
         * 
         */
        public Builder bestEffort(Boolean bestEffort) {
            return bestEffort(Output.of(bestEffort));
        }

        /**
         * @param configurationData Configures the restriction control bits. Must be between 0 and 3 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder configurationData(Output<Integer> configurationData) {
            $.configurationData = configurationData;
            return this;
        }

        /**
         * @param configurationData Configures the restriction control bits. Must be between 0 and 3 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder configurationData(Integer configurationData) {
            return configurationData(Output.of(configurationData));
        }

        public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs build() {
            $.bestEffort = Objects.requireNonNull($.bestEffort, "expected parameter 'bestEffort' to be non-null");
            $.configurationData = Objects.requireNonNull($.configurationData, "expected parameter 'configurationData' to be non-null");
            return $;
        }
    }

}
