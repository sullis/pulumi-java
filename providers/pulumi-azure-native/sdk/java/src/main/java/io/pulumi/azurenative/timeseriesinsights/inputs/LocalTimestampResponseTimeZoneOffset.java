// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that represents the offset information for the local timestamp format specified. Should not be specified for LocalTimestampFormat - Embedded.
 * 
 */
public final class LocalTimestampResponseTimeZoneOffset extends io.pulumi.resources.InvokeArgs {

    public static final LocalTimestampResponseTimeZoneOffset Empty = new LocalTimestampResponseTimeZoneOffset();

    /**
     * The event property that will be contain the offset information to calculate the local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains the name of property which contains values representing the offset (eg: P1D or 1.00:00:00)
     * 
     */
    @InputImport(name="propertyName")
      private final @Nullable String propertyName;

    public Optional<String> getPropertyName() {
        return this.propertyName == null ? Optional.empty() : Optional.ofNullable(this.propertyName);
    }

    public LocalTimestampResponseTimeZoneOffset(@Nullable String propertyName) {
        this.propertyName = propertyName;
    }

    private LocalTimestampResponseTimeZoneOffset() {
        this.propertyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalTimestampResponseTimeZoneOffset defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String propertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalTimestampResponseTimeZoneOffset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyName = defaults.propertyName;
        }

        public Builder setPropertyName(@Nullable String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public LocalTimestampResponseTimeZoneOffset build() {
            return new LocalTimestampResponseTimeZoneOffset(propertyName);
        }
    }
}