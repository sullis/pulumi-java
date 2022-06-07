// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHttpRedirectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpRedirectPlainArgs Empty = new GetHttpRedirectPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HTTP Redirect.
     * 
     */
    @Import(name="httpRedirectId", required=true)
    private String httpRedirectId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HTTP Redirect.
     * 
     */
    public String httpRedirectId() {
        return this.httpRedirectId;
    }

    private GetHttpRedirectPlainArgs() {}

    private GetHttpRedirectPlainArgs(GetHttpRedirectPlainArgs $) {
        this.httpRedirectId = $.httpRedirectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpRedirectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpRedirectPlainArgs $;

        public Builder() {
            $ = new GetHttpRedirectPlainArgs();
        }

        public Builder(GetHttpRedirectPlainArgs defaults) {
            $ = new GetHttpRedirectPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpRedirectId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HTTP Redirect.
         * 
         * @return builder
         * 
         */
        public Builder httpRedirectId(String httpRedirectId) {
            $.httpRedirectId = httpRedirectId;
            return this;
        }

        public GetHttpRedirectPlainArgs build() {
            $.httpRedirectId = Objects.requireNonNull($.httpRedirectId, "expected parameter 'httpRedirectId' to be non-null");
            return $;
        }
    }

}
