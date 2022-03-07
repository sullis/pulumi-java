// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configures the Explicit Analog Television Output Restriction control bits. For further details see the PlayReady Compliance Rules.
 * 
 */
public final class ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse Empty = new ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse();

    /**
     * Indicates whether this restriction is enforced on a Best Effort basis.
     * 
     */
    @InputImport(name="bestEffort", required=true)
      private final Boolean bestEffort;

    public Boolean getBestEffort() {
        return this.bestEffort;
    }

    /**
     * Configures the restriction control bits. Must be between 0 and 3 inclusive.
     * 
     */
    @InputImport(name="configurationData", required=true)
      private final Integer configurationData;

    public Integer getConfigurationData() {
        return this.configurationData;
    }

    public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse(
        Boolean bestEffort,
        Integer configurationData) {
        this.bestEffort = Objects.requireNonNull(bestEffort, "expected parameter 'bestEffort' to be non-null");
        this.configurationData = Objects.requireNonNull(configurationData, "expected parameter 'configurationData' to be non-null");
    }

    private ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse() {
        this.bestEffort = null;
        this.configurationData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean bestEffort;
        private Integer configurationData;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bestEffort = defaults.bestEffort;
    	      this.configurationData = defaults.configurationData;
        }

        public Builder setBestEffort(Boolean bestEffort) {
            this.bestEffort = Objects.requireNonNull(bestEffort);
            return this;
        }

        public Builder setConfigurationData(Integer configurationData) {
            this.configurationData = Objects.requireNonNull(configurationData);
            return this;
        }
        public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse build() {
            return new ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse(bestEffort, configurationData);
        }
    }
}