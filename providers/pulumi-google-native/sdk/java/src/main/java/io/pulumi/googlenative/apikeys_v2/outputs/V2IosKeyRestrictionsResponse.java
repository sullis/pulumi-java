// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class V2IosKeyRestrictionsResponse {
    /**
     * A list of bundle IDs that are allowed when making API calls with this key.
     * 
     */
    private final List<String> allowedBundleIds;

    @CustomType.Constructor
    private V2IosKeyRestrictionsResponse(@CustomType.Parameter("allowedBundleIds") List<String> allowedBundleIds) {
        this.allowedBundleIds = allowedBundleIds;
    }

    /**
     * A list of bundle IDs that are allowed when making API calls with this key.
     * 
    */
    public List<String> getAllowedBundleIds() {
        return this.allowedBundleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2IosKeyRestrictionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedBundleIds;

        public Builder() {
    	      // Empty
        }

        public Builder(V2IosKeyRestrictionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        public Builder allowedBundleIds(List<String> allowedBundleIds) {
            this.allowedBundleIds = Objects.requireNonNull(allowedBundleIds);
            return this;
        }
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }        public V2IosKeyRestrictionsResponse build() {
            return new V2IosKeyRestrictionsResponse(allowedBundleIds);
        }
    }
}
