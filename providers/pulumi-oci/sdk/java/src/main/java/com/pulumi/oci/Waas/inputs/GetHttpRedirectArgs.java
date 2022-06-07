// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHttpRedirectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpRedirectArgs Empty = new GetHttpRedirectArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HTTP Redirect.
     * 
     */
    @Import(name="httpRedirectId", required=true)
    private Output<String> httpRedirectId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HTTP Redirect.
     * 
     */
    public Output<String> httpRedirectId() {
        return this.httpRedirectId;
    }

    private GetHttpRedirectArgs() {}

    private GetHttpRedirectArgs(GetHttpRedirectArgs $) {
        this.httpRedirectId = $.httpRedirectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpRedirectArgs $;

        public Builder() {
            $ = new GetHttpRedirectArgs();
        }

        public Builder(GetHttpRedirectArgs defaults) {
            $ = new GetHttpRedirectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpRedirectId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HTTP Redirect.
         * 
         * @return builder
         * 
         */
        public Builder httpRedirectId(Output<String> httpRedirectId) {
            $.httpRedirectId = httpRedirectId;
            return this;
        }

        /**
         * @param httpRedirectId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HTTP Redirect.
         * 
         * @return builder
         * 
         */
        public Builder httpRedirectId(String httpRedirectId) {
            return httpRedirectId(Output.of(httpRedirectId));
        }

        public GetHttpRedirectArgs build() {
            $.httpRedirectId = Objects.requireNonNull($.httpRedirectId, "expected parameter 'httpRedirectId' to be non-null");
            return $;
        }
    }

}
