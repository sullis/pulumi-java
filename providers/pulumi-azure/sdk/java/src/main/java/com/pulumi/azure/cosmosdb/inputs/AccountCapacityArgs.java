// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class AccountCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountCapacityArgs Empty = new AccountCapacityArgs();

    /**
     * The total throughput limit imposed on this Cosmos DB account (RU/s). Possible values are at least `-1`. `-1` means no limit.
     * 
     */
    @Import(name="totalThroughputLimit", required=true)
    private Output<Integer> totalThroughputLimit;

    /**
     * @return The total throughput limit imposed on this Cosmos DB account (RU/s). Possible values are at least `-1`. `-1` means no limit.
     * 
     */
    public Output<Integer> totalThroughputLimit() {
        return this.totalThroughputLimit;
    }

    private AccountCapacityArgs() {}

    private AccountCapacityArgs(AccountCapacityArgs $) {
        this.totalThroughputLimit = $.totalThroughputLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountCapacityArgs $;

        public Builder() {
            $ = new AccountCapacityArgs();
        }

        public Builder(AccountCapacityArgs defaults) {
            $ = new AccountCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param totalThroughputLimit The total throughput limit imposed on this Cosmos DB account (RU/s). Possible values are at least `-1`. `-1` means no limit.
         * 
         * @return builder
         * 
         */
        public Builder totalThroughputLimit(Output<Integer> totalThroughputLimit) {
            $.totalThroughputLimit = totalThroughputLimit;
            return this;
        }

        /**
         * @param totalThroughputLimit The total throughput limit imposed on this Cosmos DB account (RU/s). Possible values are at least `-1`. `-1` means no limit.
         * 
         * @return builder
         * 
         */
        public Builder totalThroughputLimit(Integer totalThroughputLimit) {
            return totalThroughputLimit(Output.of(totalThroughputLimit));
        }

        public AccountCapacityArgs build() {
            $.totalThroughputLimit = Objects.requireNonNull($.totalThroughputLimit, "expected parameter 'totalThroughputLimit' to be non-null");
            return $;
        }
    }

}
