// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase;

import com.pulumi.azurenative.testbase.inputs.TestBaseAccountSKUArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TestBaseAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final TestBaseAccountArgs Empty = new TestBaseAccountArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The flag indicating if we would like to restore the Test Base Accounts which were soft deleted before.
     * 
     */
    @Import(name="restore")
    private @Nullable Output<Boolean> restore;

    /**
     * @return The flag indicating if we would like to restore the Test Base Accounts which were soft deleted before.
     * 
     */
    public Optional<Output<Boolean>> restore() {
        return Optional.ofNullable(this.restore);
    }

    /**
     * The SKU of the Test Base Account.
     * 
     */
    @Import(name="sku", required=true)
    private Output<TestBaseAccountSKUArgs> sku;

    /**
     * @return The SKU of the Test Base Account.
     * 
     */
    public Output<TestBaseAccountSKUArgs> sku() {
        return this.sku;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName")
    private @Nullable Output<String> testBaseAccountName;

    /**
     * @return The resource name of the Test Base Account.
     * 
     */
    public Optional<Output<String>> testBaseAccountName() {
        return Optional.ofNullable(this.testBaseAccountName);
    }

    private TestBaseAccountArgs() {}

    private TestBaseAccountArgs(TestBaseAccountArgs $) {
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.restore = $.restore;
        this.sku = $.sku;
        this.tags = $.tags;
        this.testBaseAccountName = $.testBaseAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestBaseAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestBaseAccountArgs $;

        public Builder() {
            $ = new TestBaseAccountArgs();
        }

        public Builder(TestBaseAccountArgs defaults) {
            $ = new TestBaseAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param restore The flag indicating if we would like to restore the Test Base Accounts which were soft deleted before.
         * 
         * @return builder
         * 
         */
        public Builder restore(@Nullable Output<Boolean> restore) {
            $.restore = restore;
            return this;
        }

        /**
         * @param restore The flag indicating if we would like to restore the Test Base Accounts which were soft deleted before.
         * 
         * @return builder
         * 
         */
        public Builder restore(Boolean restore) {
            return restore(Output.of(restore));
        }

        /**
         * @param sku The SKU of the Test Base Account.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<TestBaseAccountSKUArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the Test Base Account.
         * 
         * @return builder
         * 
         */
        public Builder sku(TestBaseAccountSKUArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param testBaseAccountName The resource name of the Test Base Account.
         * 
         * @return builder
         * 
         */
        public Builder testBaseAccountName(@Nullable Output<String> testBaseAccountName) {
            $.testBaseAccountName = testBaseAccountName;
            return this;
        }

        /**
         * @param testBaseAccountName The resource name of the Test Base Account.
         * 
         * @return builder
         * 
         */
        public Builder testBaseAccountName(String testBaseAccountName) {
            return testBaseAccountName(Output.of(testBaseAccountName));
        }

        public TestBaseAccountArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
