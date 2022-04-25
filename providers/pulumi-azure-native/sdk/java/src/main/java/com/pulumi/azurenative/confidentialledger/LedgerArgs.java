// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.confidentialledger;

import com.pulumi.azurenative.confidentialledger.inputs.LedgerPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LedgerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LedgerArgs Empty = new LedgerArgs();

    /**
     * Name of the Confidential Ledger
     * 
     */
    @Import(name="ledgerName")
    private @Nullable Output<String> ledgerName;

    /**
     * @return Name of the Confidential Ledger
     * 
     */
    public Optional<Output<String>> ledgerName() {
        return Optional.ofNullable(this.ledgerName);
    }

    /**
     * The Azure location where the Confidential Ledger is running.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure location where the Confidential Ledger is running.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Properties of Confidential Ledger Resource.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<LedgerPropertiesArgs> properties;

    /**
     * @return Properties of Confidential Ledger Resource.
     * 
     */
    public Optional<Output<LedgerPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Additional tags for Confidential Ledger
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Additional tags for Confidential Ledger
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private LedgerArgs() {}

    private LedgerArgs(LedgerArgs $) {
        this.ledgerName = $.ledgerName;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LedgerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LedgerArgs $;

        public Builder() {
            $ = new LedgerArgs();
        }

        public Builder(LedgerArgs defaults) {
            $ = new LedgerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ledgerName Name of the Confidential Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerName(@Nullable Output<String> ledgerName) {
            $.ledgerName = ledgerName;
            return this;
        }

        /**
         * @param ledgerName Name of the Confidential Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerName(String ledgerName) {
            return ledgerName(Output.of(ledgerName));
        }

        /**
         * @param location The Azure location where the Confidential Ledger is running.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure location where the Confidential Ledger is running.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties Properties of Confidential Ledger Resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<LedgerPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of Confidential Ledger Resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(LedgerPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Additional tags for Confidential Ledger
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Additional tags for Confidential Ledger
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public LedgerArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
