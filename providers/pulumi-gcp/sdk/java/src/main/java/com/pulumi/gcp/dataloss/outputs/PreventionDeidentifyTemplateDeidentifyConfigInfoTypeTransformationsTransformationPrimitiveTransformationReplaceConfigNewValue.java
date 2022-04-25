// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValue {
    /**
     * @return A boolean value.
     * 
     */
    private final @Nullable Boolean booleanValue;
    /**
     * @return Represents a whole or partial calendar date.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue dateValue;
    /**
     * @return Represents a day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    private final @Nullable String dayOfWeekValue;
    /**
     * @return A float value.
     * 
     */
    private final @Nullable Double floatValue;
    /**
     * @return An integer value.
     * 
     */
    private final @Nullable Integer integerValue;
    /**
     * @return A string value.
     * 
     */
    private final @Nullable String stringValue;
    /**
     * @return Represents a time of day.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue timeValue;
    /**
     * @return A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private final @Nullable String timestampValue;

    @CustomType.Constructor
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValue(
        @CustomType.Parameter("booleanValue") @Nullable Boolean booleanValue,
        @CustomType.Parameter("dateValue") @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue dateValue,
        @CustomType.Parameter("dayOfWeekValue") @Nullable String dayOfWeekValue,
        @CustomType.Parameter("floatValue") @Nullable Double floatValue,
        @CustomType.Parameter("integerValue") @Nullable Integer integerValue,
        @CustomType.Parameter("stringValue") @Nullable String stringValue,
        @CustomType.Parameter("timeValue") @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue timeValue,
        @CustomType.Parameter("timestampValue") @Nullable String timestampValue) {
        this.booleanValue = booleanValue;
        this.dateValue = dateValue;
        this.dayOfWeekValue = dayOfWeekValue;
        this.floatValue = floatValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
        this.timeValue = timeValue;
        this.timestampValue = timestampValue;
    }

    /**
     * @return A boolean value.
     * 
     */
    public Optional<Boolean> booleanValue() {
        return Optional.ofNullable(this.booleanValue);
    }
    /**
     * @return Represents a whole or partial calendar date.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue> dateValue() {
        return Optional.ofNullable(this.dateValue);
    }
    /**
     * @return Represents a day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    public Optional<String> dayOfWeekValue() {
        return Optional.ofNullable(this.dayOfWeekValue);
    }
    /**
     * @return A float value.
     * 
     */
    public Optional<Double> floatValue() {
        return Optional.ofNullable(this.floatValue);
    }
    /**
     * @return An integer value.
     * 
     */
    public Optional<Integer> integerValue() {
        return Optional.ofNullable(this.integerValue);
    }
    /**
     * @return A string value.
     * 
     */
    public Optional<String> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }
    /**
     * @return Represents a time of day.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue> timeValue() {
        return Optional.ofNullable(this.timeValue);
    }
    /**
     * @return A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<String> timestampValue() {
        return Optional.ofNullable(this.timestampValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean booleanValue;
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue dateValue;
        private @Nullable String dayOfWeekValue;
        private @Nullable Double floatValue;
        private @Nullable Integer integerValue;
        private @Nullable String stringValue;
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue timeValue;
        private @Nullable String timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.dateValue = defaults.dateValue;
    	      this.dayOfWeekValue = defaults.dayOfWeekValue;
    	      this.floatValue = defaults.floatValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
    	      this.timeValue = defaults.timeValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder booleanValue(@Nullable Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }
        public Builder dateValue(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue dateValue) {
            this.dateValue = dateValue;
            return this;
        }
        public Builder dayOfWeekValue(@Nullable String dayOfWeekValue) {
            this.dayOfWeekValue = dayOfWeekValue;
            return this;
        }
        public Builder floatValue(@Nullable Double floatValue) {
            this.floatValue = floatValue;
            return this;
        }
        public Builder integerValue(@Nullable Integer integerValue) {
            this.integerValue = integerValue;
            return this;
        }
        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public Builder timeValue(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue timeValue) {
            this.timeValue = timeValue;
            return this;
        }
        public Builder timestampValue(@Nullable String timestampValue) {
            this.timestampValue = timestampValue;
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValue build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValue(booleanValue, dateValue, dayOfWeekValue, floatValue, integerValue, stringValue, timeValue, timestampValue);
        }
    }
}
