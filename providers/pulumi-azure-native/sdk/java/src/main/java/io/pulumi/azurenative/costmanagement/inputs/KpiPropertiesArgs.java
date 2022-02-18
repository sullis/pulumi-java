// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.KpiTypeType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Each KPI must contain a 'type' and 'enabled' key.
 * 
 */
public final class KpiPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KpiPropertiesArgs Empty = new KpiPropertiesArgs();

    /**
     * show the KPI in the UI?
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * ID of resource related to metric (budget).
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * KPI type (Forecast, Budget).
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<Either<String,KpiTypeType>> type;

    public Input<Either<String,KpiTypeType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public KpiPropertiesArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> id,
        @Nullable Input<Either<String,KpiTypeType>> type) {
        this.enabled = enabled;
        this.id = id;
        this.type = type;
    }

    private KpiPropertiesArgs() {
        this.enabled = Input.empty();
        this.id = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> id;
        private @Nullable Input<Either<String,KpiTypeType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,KpiTypeType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,KpiTypeType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public KpiPropertiesArgs build() {
            return new KpiPropertiesArgs(enabled, id, type);
        }
    }
}
