// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.VideoArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoFlagsResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoMediaInfoResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoStreamingResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The representation of a single video in a Video Analyzer account.
 * API Version: 2021-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:videoanalyzer:Video video1 /subscriptions/591e76c3-3e97-44db-879c-3e2b12961b62/resourceGroups/testrg/providers/Microsoft.Media/videoAnalyzers/testaccount2/videos/video1 
 * ```
 * 
 */
@ResourceType(type="azure-native:videoanalyzer:Video")
public class Video extends io.pulumi.resources.CustomResource {
    /**
     * Optional video description provided by the user. Value can be up to 2048 characters long.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Optional video description provided by the user. Value can be up to 2048 characters long.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Video flags contain information about the available video actions and its dynamic properties based on the current video state.
     * 
     */
    @OutputExport(name="flags", type=VideoFlagsResponse.class, parameters={})
    private Output<VideoFlagsResponse> flags;

    /**
     * @return Video flags contain information about the available video actions and its dynamic properties based on the current video state.
     * 
     */
    public Output<VideoFlagsResponse> getFlags() {
        return this.flags;
    }
    /**
     * Contains information about the video and audio content.
     * 
     */
    @OutputExport(name="mediaInfo", type=VideoMediaInfoResponse.class, parameters={})
    private Output<VideoMediaInfoResponse> mediaInfo;

    /**
     * @return Contains information about the video and audio content.
     * 
     */
    public Output<VideoMediaInfoResponse> getMediaInfo() {
        return this.mediaInfo;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Video streaming holds information about video streaming URLs.
     * 
     */
    @OutputExport(name="streaming", type=VideoStreamingResponse.class, parameters={})
    private Output<VideoStreamingResponse> streaming;

    /**
     * @return Video streaming holds information about video streaming URLs.
     * 
     */
    public Output<VideoStreamingResponse> getStreaming() {
        return this.streaming;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Optional video title provided by the user. Value can be up to 256 characters long.
     * 
     */
    @OutputExport(name="title", type=String.class, parameters={})
    private Output</* @Nullable */ String> title;

    /**
     * @return Optional video title provided by the user. Value can be up to 256 characters long.
     * 
     */
    public Output</* @Nullable */ String> getTitle() {
        return this.title;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(VideoArgs.Builder a);
    }
    private static io.pulumi.azurenative.videoanalyzer.VideoArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.videoanalyzer.VideoArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Video(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Video(String name) {
        this(name, VideoArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Video(String name, VideoArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Video(String name, VideoArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:Video", name, args == null ? VideoArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Video(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:Video", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:videoanalyzer/v20210501preview:Video").build()),
                Input.of(Alias.builder().setType("azure-native:videoanalyzer/v20211101preview:Video").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Video get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Video(name, id, options);
    }
}