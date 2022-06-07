// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderReplayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFolderReplayPlainArgs Empty = new GetFolderReplayPlainArgs();

    @Import(name="folderId", required=true)
    private String folderId;

    public String folderId() {
        return this.folderId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="replayId", required=true)
    private String replayId;

    public String replayId() {
        return this.replayId;
    }

    private GetFolderReplayPlainArgs() {}

    private GetFolderReplayPlainArgs(GetFolderReplayPlainArgs $) {
        this.folderId = $.folderId;
        this.location = $.location;
        this.replayId = $.replayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFolderReplayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFolderReplayPlainArgs $;

        public Builder() {
            $ = new GetFolderReplayPlainArgs();
        }

        public Builder(GetFolderReplayPlainArgs defaults) {
            $ = new GetFolderReplayPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder folderId(String folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder replayId(String replayId) {
            $.replayId = replayId;
            return this;
        }

        public GetFolderReplayPlainArgs build() {
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.replayId = Objects.requireNonNull($.replayId, "expected parameter 'replayId' to be non-null");
            return $;
        }
    }

}
