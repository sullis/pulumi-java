// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.azurenative.storsimple.enums.ManagerType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Intrinsic settings which refers to the type of the StorSimple Manager.
 * 
 */
public final class ManagerIntrinsicSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagerIntrinsicSettingsArgs Empty = new ManagerIntrinsicSettingsArgs();

    /**
     * The type of StorSimple Manager.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<ManagerType> type;

    public Input<ManagerType> getType() {
        return this.type;
    }

    public ManagerIntrinsicSettingsArgs(Input<ManagerType> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagerIntrinsicSettingsArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagerIntrinsicSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ManagerType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagerIntrinsicSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<ManagerType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(ManagerType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ManagerIntrinsicSettingsArgs build() {
            return new ManagerIntrinsicSettingsArgs(type);
        }
    }
}