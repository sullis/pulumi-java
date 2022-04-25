// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Retention duration.
 * 
 */
public final class RetentionDurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final RetentionDurationResponse Empty = new RetentionDurationResponse();

    /**
     * Count of duration types. Retention duration is obtained by the counting the duration type Count times.
     * For example, when Count = 3 and DurationType = Weeks, retention duration will be three weeks.
     * 
     */
    @Import(name="count")
    private @Nullable Integer count;

    /**
     * @return Count of duration types. Retention duration is obtained by the counting the duration type Count times.
     * For example, when Count = 3 and DurationType = Weeks, retention duration will be three weeks.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Retention duration type of retention policy.
     * 
     */
    @Import(name="durationType")
    private @Nullable String durationType;

    /**
     * @return Retention duration type of retention policy.
     * 
     */
    public Optional<String> durationType() {
        return Optional.ofNullable(this.durationType);
    }

    private RetentionDurationResponse() {}

    private RetentionDurationResponse(RetentionDurationResponse $) {
        this.count = $.count;
        this.durationType = $.durationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RetentionDurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetentionDurationResponse $;

        public Builder() {
            $ = new RetentionDurationResponse();
        }

        public Builder(RetentionDurationResponse defaults) {
            $ = new RetentionDurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Count of duration types. Retention duration is obtained by the counting the duration type Count times.
         * For example, when Count = 3 and DurationType = Weeks, retention duration will be three weeks.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Integer count) {
            $.count = count;
            return this;
        }

        /**
         * @param durationType Retention duration type of retention policy.
         * 
         * @return builder
         * 
         */
        public Builder durationType(@Nullable String durationType) {
            $.durationType = durationType;
            return this;
        }

        public RetentionDurationResponse build() {
            return $;
        }
    }

}
