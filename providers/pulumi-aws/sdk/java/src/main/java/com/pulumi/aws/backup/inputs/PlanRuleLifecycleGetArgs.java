// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlanRuleLifecycleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlanRuleLifecycleGetArgs Empty = new PlanRuleLifecycleGetArgs();

    /**
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * 
     */
    @Import(name="coldStorageAfter")
    private @Nullable Output<Integer> coldStorageAfter;

    /**
     * @return Specifies the number of days after creation that a recovery point is moved to cold storage.
     * 
     */
    public Optional<Output<Integer>> coldStorageAfter() {
        return Optional.ofNullable(this.coldStorageAfter);
    }

    /**
     * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `cold_storage_after`.
     * 
     */
    @Import(name="deleteAfter")
    private @Nullable Output<Integer> deleteAfter;

    /**
     * @return Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `cold_storage_after`.
     * 
     */
    public Optional<Output<Integer>> deleteAfter() {
        return Optional.ofNullable(this.deleteAfter);
    }

    private PlanRuleLifecycleGetArgs() {}

    private PlanRuleLifecycleGetArgs(PlanRuleLifecycleGetArgs $) {
        this.coldStorageAfter = $.coldStorageAfter;
        this.deleteAfter = $.deleteAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlanRuleLifecycleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlanRuleLifecycleGetArgs $;

        public Builder() {
            $ = new PlanRuleLifecycleGetArgs();
        }

        public Builder(PlanRuleLifecycleGetArgs defaults) {
            $ = new PlanRuleLifecycleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param coldStorageAfter Specifies the number of days after creation that a recovery point is moved to cold storage.
         * 
         * @return builder
         * 
         */
        public Builder coldStorageAfter(@Nullable Output<Integer> coldStorageAfter) {
            $.coldStorageAfter = coldStorageAfter;
            return this;
        }

        /**
         * @param coldStorageAfter Specifies the number of days after creation that a recovery point is moved to cold storage.
         * 
         * @return builder
         * 
         */
        public Builder coldStorageAfter(Integer coldStorageAfter) {
            return coldStorageAfter(Output.of(coldStorageAfter));
        }

        /**
         * @param deleteAfter Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `cold_storage_after`.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfter(@Nullable Output<Integer> deleteAfter) {
            $.deleteAfter = deleteAfter;
            return this;
        }

        /**
         * @param deleteAfter Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `cold_storage_after`.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfter(Integer deleteAfter) {
            return deleteAfter(Output.of(deleteAfter));
        }

        public PlanRuleLifecycleGetArgs build() {
            return $;
        }
    }

}
