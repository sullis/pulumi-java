// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Day of the week
 * 
 */
public final class DayArgs extends io.pulumi.resources.ResourceArgs {

    public static final DayArgs Empty = new DayArgs();

    /**
     * Date of the month
     * 
     */
    @InputImport(name="date")
    private final @Nullable Input<Integer> date;

    public Input<Integer> getDate() {
        return this.date == null ? Input.empty() : this.date;
    }

    /**
     * Whether Date is last date of month
     * 
     */
    @InputImport(name="isLast")
    private final @Nullable Input<Boolean> isLast;

    public Input<Boolean> getIsLast() {
        return this.isLast == null ? Input.empty() : this.isLast;
    }

    public DayArgs(
        @Nullable Input<Integer> date,
        @Nullable Input<Boolean> isLast) {
        this.date = date;
        this.isLast = isLast;
    }

    private DayArgs() {
        this.date = Input.empty();
        this.isLast = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> date;
        private @Nullable Input<Boolean> isLast;

        public Builder() {
    	      // Empty
        }

        public Builder(DayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.isLast = defaults.isLast;
        }

        public Builder setDate(@Nullable Input<Integer> date) {
            this.date = date;
            return this;
        }

        public Builder setDate(@Nullable Integer date) {
            this.date = Input.ofNullable(date);
            return this;
        }

        public Builder setIsLast(@Nullable Input<Boolean> isLast) {
            this.isLast = isLast;
            return this;
        }

        public Builder setIsLast(@Nullable Boolean isLast) {
            this.isLast = Input.ofNullable(isLast);
            return this;
        }

        public DayArgs build() {
            return new DayArgs(date, isLast);
        }
    }
}
