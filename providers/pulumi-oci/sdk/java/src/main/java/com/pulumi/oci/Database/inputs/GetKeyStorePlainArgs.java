// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeyStorePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyStorePlainArgs Empty = new GetKeyStorePlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key store.
     * 
     */
    @Import(name="keyStoreId", required=true)
    private String keyStoreId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key store.
     * 
     */
    public String keyStoreId() {
        return this.keyStoreId;
    }

    private GetKeyStorePlainArgs() {}

    private GetKeyStorePlainArgs(GetKeyStorePlainArgs $) {
        this.keyStoreId = $.keyStoreId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyStorePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyStorePlainArgs $;

        public Builder() {
            $ = new GetKeyStorePlainArgs();
        }

        public Builder(GetKeyStorePlainArgs defaults) {
            $ = new GetKeyStorePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyStoreId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key store.
         * 
         * @return builder
         * 
         */
        public Builder keyStoreId(String keyStoreId) {
            $.keyStoreId = keyStoreId;
            return this;
        }

        public GetKeyStorePlainArgs build() {
            $.keyStoreId = Objects.requireNonNull($.keyStoreId, "expected parameter 'keyStoreId' to be non-null");
            return $;
        }
    }

}
