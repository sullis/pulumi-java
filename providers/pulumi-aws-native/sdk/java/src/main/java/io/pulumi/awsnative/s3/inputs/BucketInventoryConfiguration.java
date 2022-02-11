// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketInventoryConfigurationIncludedObjectVersions;
import io.pulumi.awsnative.s3.enums.BucketInventoryConfigurationOptionalFieldsItem;
import io.pulumi.awsnative.s3.enums.BucketInventoryConfigurationScheduleFrequency;
import io.pulumi.awsnative.s3.inputs.BucketDestination;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketInventoryConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketInventoryConfiguration Empty = new BucketInventoryConfiguration();

    @InputImport(name="destination", required=true)
    private final BucketDestination destination;

    public BucketDestination getDestination() {
        return this.destination;
    }

    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="includedObjectVersions", required=true)
    private final BucketInventoryConfigurationIncludedObjectVersions includedObjectVersions;

    public BucketInventoryConfigurationIncludedObjectVersions getIncludedObjectVersions() {
        return this.includedObjectVersions;
    }

    @InputImport(name="optionalFields")
    private final @Nullable List<BucketInventoryConfigurationOptionalFieldsItem> optionalFields;

    public List<BucketInventoryConfigurationOptionalFieldsItem> getOptionalFields() {
        return this.optionalFields == null ? List.of() : this.optionalFields;
    }

    @InputImport(name="prefix")
    private final @Nullable String prefix;

    public Optional<String> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    @InputImport(name="scheduleFrequency", required=true)
    private final BucketInventoryConfigurationScheduleFrequency scheduleFrequency;

    public BucketInventoryConfigurationScheduleFrequency getScheduleFrequency() {
        return this.scheduleFrequency;
    }

    public BucketInventoryConfiguration(
        BucketDestination destination,
        Boolean enabled,
        String id,
        BucketInventoryConfigurationIncludedObjectVersions includedObjectVersions,
        @Nullable List<BucketInventoryConfigurationOptionalFieldsItem> optionalFields,
        @Nullable String prefix,
        BucketInventoryConfigurationScheduleFrequency scheduleFrequency) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.includedObjectVersions = Objects.requireNonNull(includedObjectVersions, "expected parameter 'includedObjectVersions' to be non-null");
        this.optionalFields = optionalFields;
        this.prefix = prefix;
        this.scheduleFrequency = Objects.requireNonNull(scheduleFrequency, "expected parameter 'scheduleFrequency' to be non-null");
    }

    private BucketInventoryConfiguration() {
        this.destination = null;
        this.enabled = null;
        this.id = null;
        this.includedObjectVersions = null;
        this.optionalFields = List.of();
        this.prefix = null;
        this.scheduleFrequency = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketInventoryConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketDestination destination;
        private Boolean enabled;
        private String id;
        private BucketInventoryConfigurationIncludedObjectVersions includedObjectVersions;
        private @Nullable List<BucketInventoryConfigurationOptionalFieldsItem> optionalFields;
        private @Nullable String prefix;
        private BucketInventoryConfigurationScheduleFrequency scheduleFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketInventoryConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.includedObjectVersions = defaults.includedObjectVersions;
    	      this.optionalFields = defaults.optionalFields;
    	      this.prefix = defaults.prefix;
    	      this.scheduleFrequency = defaults.scheduleFrequency;
        }

        public Builder setDestination(BucketDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIncludedObjectVersions(BucketInventoryConfigurationIncludedObjectVersions includedObjectVersions) {
            this.includedObjectVersions = Objects.requireNonNull(includedObjectVersions);
            return this;
        }

        public Builder setOptionalFields(@Nullable List<BucketInventoryConfigurationOptionalFieldsItem> optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setScheduleFrequency(BucketInventoryConfigurationScheduleFrequency scheduleFrequency) {
            this.scheduleFrequency = Objects.requireNonNull(scheduleFrequency);
            return this;
        }

        public BucketInventoryConfiguration build() {
            return new BucketInventoryConfiguration(destination, enabled, id, includedObjectVersions, optionalFields, prefix, scheduleFrequency);
        }
    }
}
