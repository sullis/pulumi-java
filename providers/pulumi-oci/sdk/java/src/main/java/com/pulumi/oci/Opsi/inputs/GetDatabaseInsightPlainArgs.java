// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseInsightPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInsightPlainArgs Empty = new GetDatabaseInsightPlainArgs();

    /**
     * Unique database insight identifier
     * 
     */
    @Import(name="databaseInsightId", required=true)
    private String databaseInsightId;

    /**
     * @return Unique database insight identifier
     * 
     */
    public String databaseInsightId() {
        return this.databaseInsightId;
    }

    private GetDatabaseInsightPlainArgs() {}

    private GetDatabaseInsightPlainArgs(GetDatabaseInsightPlainArgs $) {
        this.databaseInsightId = $.databaseInsightId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseInsightPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseInsightPlainArgs $;

        public Builder() {
            $ = new GetDatabaseInsightPlainArgs();
        }

        public Builder(GetDatabaseInsightPlainArgs defaults) {
            $ = new GetDatabaseInsightPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseInsightId Unique database insight identifier
         * 
         * @return builder
         * 
         */
        public Builder databaseInsightId(String databaseInsightId) {
            $.databaseInsightId = databaseInsightId;
            return this;
        }

        public GetDatabaseInsightPlainArgs build() {
            $.databaseInsightId = Objects.requireNonNull($.databaseInsightId, "expected parameter 'databaseInsightId' to be non-null");
            return $;
        }
    }

}
