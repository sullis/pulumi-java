// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances in the game server group.
 * 
 */
public final class GameServerGroupLaunchTemplate extends io.pulumi.resources.InvokeArgs {

    public static final GameServerGroupLaunchTemplate Empty = new GameServerGroupLaunchTemplate();

    @InputImport(name="launchTemplateId")
    private final @Nullable String launchTemplateId;

    public Optional<String> getLaunchTemplateId() {
        return this.launchTemplateId == null ? Optional.empty() : Optional.ofNullable(this.launchTemplateId);
    }

    @InputImport(name="launchTemplateName")
    private final @Nullable String launchTemplateName;

    public Optional<String> getLaunchTemplateName() {
        return this.launchTemplateName == null ? Optional.empty() : Optional.ofNullable(this.launchTemplateName);
    }

    @InputImport(name="version")
    private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GameServerGroupLaunchTemplate(
        @Nullable String launchTemplateId,
        @Nullable String launchTemplateName,
        @Nullable String version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = version;
    }

    private GameServerGroupLaunchTemplate() {
        this.launchTemplateId = null;
        this.launchTemplateName = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupLaunchTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String launchTemplateId;
        private @Nullable String launchTemplateName;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerGroupLaunchTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder setLaunchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder setLaunchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public GameServerGroupLaunchTemplate build() {
            return new GameServerGroupLaunchTemplate(launchTemplateId, launchTemplateName, version);
        }
    }
}
