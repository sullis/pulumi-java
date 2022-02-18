// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSettingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSettingArgs Empty = new GetSettingArgs();

    /**
     * Name of the setting. Allowed values: myscope
     * 
     */
    @InputImport(name="settingName", required=true)
    private final String settingName;

    public String getSettingName() {
        return this.settingName;
    }

    public GetSettingArgs(String settingName) {
        this.settingName = Objects.requireNonNull(settingName, "expected parameter 'settingName' to be non-null");
    }

    private GetSettingArgs() {
        this.settingName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String settingName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.settingName = defaults.settingName;
        }

        public Builder setSettingName(String settingName) {
            this.settingName = Objects.requireNonNull(settingName);
            return this;
        }

        public GetSettingArgs build() {
            return new GetSettingArgs(settingName);
        }
    }
}
