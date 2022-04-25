// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apikeys_v2.inputs.V2AndroidApplicationResponse;
import java.util.List;
import java.util.Objects;


/**
 * The Android apps that are allowed to use the key.
 * 
 */
public final class V2AndroidKeyRestrictionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final V2AndroidKeyRestrictionsResponse Empty = new V2AndroidKeyRestrictionsResponse();

    /**
     * A list of Android applications that are allowed to make API calls with this key.
     * 
     */
    @Import(name="allowedApplications", required=true)
    private List<V2AndroidApplicationResponse> allowedApplications;

    /**
     * @return A list of Android applications that are allowed to make API calls with this key.
     * 
     */
    public List<V2AndroidApplicationResponse> allowedApplications() {
        return this.allowedApplications;
    }

    private V2AndroidKeyRestrictionsResponse() {}

    private V2AndroidKeyRestrictionsResponse(V2AndroidKeyRestrictionsResponse $) {
        this.allowedApplications = $.allowedApplications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2AndroidKeyRestrictionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2AndroidKeyRestrictionsResponse $;

        public Builder() {
            $ = new V2AndroidKeyRestrictionsResponse();
        }

        public Builder(V2AndroidKeyRestrictionsResponse defaults) {
            $ = new V2AndroidKeyRestrictionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedApplications A list of Android applications that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedApplications(List<V2AndroidApplicationResponse> allowedApplications) {
            $.allowedApplications = allowedApplications;
            return this;
        }

        /**
         * @param allowedApplications A list of Android applications that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedApplications(V2AndroidApplicationResponse... allowedApplications) {
            return allowedApplications(List.of(allowedApplications));
        }

        public V2AndroidKeyRestrictionsResponse build() {
            $.allowedApplications = Objects.requireNonNull($.allowedApplications, "expected parameter 'allowedApplications' to be non-null");
            return $;
        }
    }

}
