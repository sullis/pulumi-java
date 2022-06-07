// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupArgs Empty = new GetBackupArgs();

    @Import(name="backupId", required=true)
    private Output<String> backupId;

    public Output<String> backupId() {
        return this.backupId;
    }

    @Import(name="domainId", required=true)
    private Output<String> domainId;

    public Output<String> domainId() {
        return this.domainId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBackupArgs() {}

    private GetBackupArgs(GetBackupArgs $) {
        this.backupId = $.backupId;
        this.domainId = $.domainId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupArgs $;

        public Builder() {
            $ = new GetBackupArgs();
        }

        public Builder(GetBackupArgs defaults) {
            $ = new GetBackupArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupId(Output<String> backupId) {
            $.backupId = backupId;
            return this;
        }

        public Builder backupId(String backupId) {
            return backupId(Output.of(backupId));
        }

        public Builder domainId(Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetBackupArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.domainId = Objects.requireNonNull($.domainId, "expected parameter 'domainId' to be non-null");
            return $;
        }
    }

}
