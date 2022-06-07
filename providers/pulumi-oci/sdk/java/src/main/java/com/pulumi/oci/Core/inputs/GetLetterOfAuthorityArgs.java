// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLetterOfAuthorityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLetterOfAuthorityArgs Empty = new GetLetterOfAuthorityArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
     * 
     */
    @Import(name="crossConnectId", required=true)
    private Output<String> crossConnectId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
     * 
     */
    public Output<String> crossConnectId() {
        return this.crossConnectId;
    }

    private GetLetterOfAuthorityArgs() {}

    private GetLetterOfAuthorityArgs(GetLetterOfAuthorityArgs $) {
        this.crossConnectId = $.crossConnectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLetterOfAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLetterOfAuthorityArgs $;

        public Builder() {
            $ = new GetLetterOfAuthorityArgs();
        }

        public Builder(GetLetterOfAuthorityArgs defaults) {
            $ = new GetLetterOfAuthorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossConnectId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
         * 
         * @return builder
         * 
         */
        public Builder crossConnectId(Output<String> crossConnectId) {
            $.crossConnectId = crossConnectId;
            return this;
        }

        /**
         * @param crossConnectId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
         * 
         * @return builder
         * 
         */
        public Builder crossConnectId(String crossConnectId) {
            return crossConnectId(Output.of(crossConnectId));
        }

        public GetLetterOfAuthorityArgs build() {
            $.crossConnectId = Objects.requireNonNull($.crossConnectId, "expected parameter 'crossConnectId' to be non-null");
            return $;
        }
    }

}
