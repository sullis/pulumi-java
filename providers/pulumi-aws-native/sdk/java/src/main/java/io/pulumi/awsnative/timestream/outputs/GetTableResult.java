// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.awsnative.timestream.outputs.MagneticStoreWritePropertiesProperties;
import io.pulumi.awsnative.timestream.outputs.RetentionPropertiesProperties;
import io.pulumi.awsnative.timestream.outputs.TableTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTableResult {
    private final @Nullable String arn;
    /**
     * The properties that determine whether magnetic store writes are enabled.
     * 
     */
    private final @Nullable MagneticStoreWritePropertiesProperties magneticStoreWriteProperties;
    /**
     * The table name exposed as a read-only attribute.
     * 
     */
    private final @Nullable String name;
    /**
     * The retention duration of the memory store and the magnetic store.
     * 
     */
    private final @Nullable RetentionPropertiesProperties retentionProperties;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<TableTag> tags;

    @CustomType.Constructor
    private GetTableResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("magneticStoreWriteProperties") @Nullable MagneticStoreWritePropertiesProperties magneticStoreWriteProperties,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("retentionProperties") @Nullable RetentionPropertiesProperties retentionProperties,
        @CustomType.Parameter("tags") @Nullable List<TableTag> tags) {
        this.arn = arn;
        this.magneticStoreWriteProperties = magneticStoreWriteProperties;
        this.name = name;
        this.retentionProperties = retentionProperties;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The properties that determine whether magnetic store writes are enabled.
     * 
    */
    public Optional<MagneticStoreWritePropertiesProperties> magneticStoreWriteProperties() {
        return Optional.ofNullable(this.magneticStoreWriteProperties);
    }
    /**
     * The table name exposed as a read-only attribute.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The retention duration of the memory store and the magnetic store.
     * 
    */
    public Optional<RetentionPropertiesProperties> retentionProperties() {
        return Optional.ofNullable(this.retentionProperties);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<TableTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable MagneticStoreWritePropertiesProperties magneticStoreWriteProperties;
        private @Nullable String name;
        private @Nullable RetentionPropertiesProperties retentionProperties;
        private @Nullable List<TableTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.magneticStoreWriteProperties = defaults.magneticStoreWriteProperties;
    	      this.name = defaults.name;
    	      this.retentionProperties = defaults.retentionProperties;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder magneticStoreWriteProperties(@Nullable MagneticStoreWritePropertiesProperties magneticStoreWriteProperties) {
            this.magneticStoreWriteProperties = magneticStoreWriteProperties;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder retentionProperties(@Nullable RetentionPropertiesProperties retentionProperties) {
            this.retentionProperties = retentionProperties;
            return this;
        }
        public Builder tags(@Nullable List<TableTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(TableTag... tags) {
            return tags(List.of(tags));
        }        public GetTableResult build() {
            return new GetTableResult(arn, magneticStoreWriteProperties, name, retentionProperties, tags);
        }
    }
}
