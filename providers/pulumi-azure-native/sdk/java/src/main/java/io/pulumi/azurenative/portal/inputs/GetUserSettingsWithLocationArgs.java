// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserSettingsWithLocationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserSettingsWithLocationArgs Empty = new GetUserSettingsWithLocationArgs();

    /**
     * The provider location
     * 
     */
    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * The name of the user settings
     * 
     */
    @InputImport(name="userSettingsName", required=true)
      private final String userSettingsName;

    public String getUserSettingsName() {
        return this.userSettingsName;
    }

    public GetUserSettingsWithLocationArgs(
        String location,
        String userSettingsName) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.userSettingsName = Objects.requireNonNull(userSettingsName, "expected parameter 'userSettingsName' to be non-null");
    }

    private GetUserSettingsWithLocationArgs() {
        this.location = null;
        this.userSettingsName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserSettingsWithLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String userSettingsName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserSettingsWithLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.userSettingsName = defaults.userSettingsName;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setUserSettingsName(String userSettingsName) {
            this.userSettingsName = Objects.requireNonNull(userSettingsName);
            return this;
        }
        public GetUserSettingsWithLocationArgs build() {
            return new GetUserSettingsWithLocationArgs(location, userSettingsName);
        }
    }
}