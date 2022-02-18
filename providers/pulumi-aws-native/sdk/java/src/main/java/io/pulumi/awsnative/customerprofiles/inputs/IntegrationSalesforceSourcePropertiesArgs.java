// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationSalesforceSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationSalesforceSourcePropertiesArgs Empty = new IntegrationSalesforceSourcePropertiesArgs();

    @InputImport(name="enableDynamicFieldUpdate")
    private final @Nullable Input<Boolean> enableDynamicFieldUpdate;

    public Input<Boolean> getEnableDynamicFieldUpdate() {
        return this.enableDynamicFieldUpdate == null ? Input.empty() : this.enableDynamicFieldUpdate;
    }

    @InputImport(name="includeDeletedRecords")
    private final @Nullable Input<Boolean> includeDeletedRecords;

    public Input<Boolean> getIncludeDeletedRecords() {
        return this.includeDeletedRecords == null ? Input.empty() : this.includeDeletedRecords;
    }

    @InputImport(name="object", required=true)
    private final Input<String> object;

    public Input<String> getObject() {
        return this.object;
    }

    public IntegrationSalesforceSourcePropertiesArgs(
        @Nullable Input<Boolean> enableDynamicFieldUpdate,
        @Nullable Input<Boolean> includeDeletedRecords,
        Input<String> object) {
        this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
        this.includeDeletedRecords = includeDeletedRecords;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private IntegrationSalesforceSourcePropertiesArgs() {
        this.enableDynamicFieldUpdate = Input.empty();
        this.includeDeletedRecords = Input.empty();
        this.object = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationSalesforceSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableDynamicFieldUpdate;
        private @Nullable Input<Boolean> includeDeletedRecords;
        private Input<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationSalesforceSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDynamicFieldUpdate = defaults.enableDynamicFieldUpdate;
    	      this.includeDeletedRecords = defaults.includeDeletedRecords;
    	      this.object = defaults.object;
        }

        public Builder setEnableDynamicFieldUpdate(@Nullable Input<Boolean> enableDynamicFieldUpdate) {
            this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
            return this;
        }

        public Builder setEnableDynamicFieldUpdate(@Nullable Boolean enableDynamicFieldUpdate) {
            this.enableDynamicFieldUpdate = Input.ofNullable(enableDynamicFieldUpdate);
            return this;
        }

        public Builder setIncludeDeletedRecords(@Nullable Input<Boolean> includeDeletedRecords) {
            this.includeDeletedRecords = includeDeletedRecords;
            return this;
        }

        public Builder setIncludeDeletedRecords(@Nullable Boolean includeDeletedRecords) {
            this.includeDeletedRecords = Input.ofNullable(includeDeletedRecords);
            return this;
        }

        public Builder setObject(Input<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Input.of(Objects.requireNonNull(object));
            return this;
        }

        public IntegrationSalesforceSourcePropertiesArgs build() {
            return new IntegrationSalesforceSourcePropertiesArgs(enableDynamicFieldUpdate, includeDeletedRecords, object);
        }
    }
}
