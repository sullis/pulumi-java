// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.enums.AssetPropertyNotificationState;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The asset property's definition, alias, and notification state.
 * 
 */
public final class AssetPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetPropertyArgs Empty = new AssetPropertyArgs();

    /**
     * The property alias that identifies the property.
     * 
     */
    @InputImport(name="alias")
    private final @Nullable Input<String> alias;

    public Input<String> getAlias() {
        return this.alias == null ? Input.empty() : this.alias;
    }

    /**
     * Customer provided ID for property.
     * 
     */
    @InputImport(name="logicalId", required=true)
    private final Input<String> logicalId;

    public Input<String> getLogicalId() {
        return this.logicalId;
    }

    /**
     * The MQTT notification state (ENABLED or DISABLED) for this asset property.
     * 
     */
    @InputImport(name="notificationState")
    private final @Nullable Input<AssetPropertyNotificationState> notificationState;

    public Input<AssetPropertyNotificationState> getNotificationState() {
        return this.notificationState == null ? Input.empty() : this.notificationState;
    }

    public AssetPropertyArgs(
        @Nullable Input<String> alias,
        Input<String> logicalId,
        @Nullable Input<AssetPropertyNotificationState> notificationState) {
        this.alias = alias;
        this.logicalId = Objects.requireNonNull(logicalId, "expected parameter 'logicalId' to be non-null");
        this.notificationState = notificationState;
    }

    private AssetPropertyArgs() {
        this.alias = Input.empty();
        this.logicalId = Input.empty();
        this.notificationState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alias;
        private Input<String> logicalId;
        private @Nullable Input<AssetPropertyNotificationState> notificationState;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.logicalId = defaults.logicalId;
    	      this.notificationState = defaults.notificationState;
        }

        public Builder setAlias(@Nullable Input<String> alias) {
            this.alias = alias;
            return this;
        }

        public Builder setAlias(@Nullable String alias) {
            this.alias = Input.ofNullable(alias);
            return this;
        }

        public Builder setLogicalId(Input<String> logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }

        public Builder setLogicalId(String logicalId) {
            this.logicalId = Input.of(Objects.requireNonNull(logicalId));
            return this;
        }

        public Builder setNotificationState(@Nullable Input<AssetPropertyNotificationState> notificationState) {
            this.notificationState = notificationState;
            return this;
        }

        public Builder setNotificationState(@Nullable AssetPropertyNotificationState notificationState) {
            this.notificationState = Input.ofNullable(notificationState);
            return this;
        }

        public AssetPropertyArgs build() {
            return new AssetPropertyArgs(alias, logicalId, notificationState);
        }
    }
}
