// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The iOS apps that are allowed to use the key.
 * 
 */
public final class V2IosKeyRestrictionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final V2IosKeyRestrictionsResponse Empty = new V2IosKeyRestrictionsResponse();

    /**
     * A list of bundle IDs that are allowed when making API calls with this key.
     * 
     */
    @Import(name="allowedBundleIds", required=true)
    private List<String> allowedBundleIds;

    /**
     * @return A list of bundle IDs that are allowed when making API calls with this key.
     * 
     */
    public List<String> allowedBundleIds() {
        return this.allowedBundleIds;
    }

    private V2IosKeyRestrictionsResponse() {}

    private V2IosKeyRestrictionsResponse(V2IosKeyRestrictionsResponse $) {
        this.allowedBundleIds = $.allowedBundleIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2IosKeyRestrictionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2IosKeyRestrictionsResponse $;

        public Builder() {
            $ = new V2IosKeyRestrictionsResponse();
        }

        public Builder(V2IosKeyRestrictionsResponse defaults) {
            $ = new V2IosKeyRestrictionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedBundleIds A list of bundle IDs that are allowed when making API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(List<String> allowedBundleIds) {
            $.allowedBundleIds = allowedBundleIds;
            return this;
        }

        /**
         * @param allowedBundleIds A list of bundle IDs that are allowed when making API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }

        public V2IosKeyRestrictionsResponse build() {
            $.allowedBundleIds = Objects.requireNonNull($.allowedBundleIds, "expected parameter 'allowedBundleIds' to be non-null");
            return $;
        }
    }

}
