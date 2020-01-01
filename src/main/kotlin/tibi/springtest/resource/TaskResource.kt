package tibi.springtest.resource

import tibi.springtest.model.Task
import tibi.springtest.request.TaskRequest
import java.util.*
import javax.inject.Singleton
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import kotlin.collections.LinkedHashMap


@Path("/tasks")
@Singleton
class TaskResource {

    private val tasks = LinkedHashMap<UUID, Task>()

    @POST @Consumes(MediaType.APPLICATION_JSON)
    fun createTask(request: TaskRequest): String {
        val taskId = UUID.randomUUID()
        tasks[taskId] = Task(taskId, request.description)
        return taskId.toString()
    }

    @GET @Produces(MediaType.APPLICATION_JSON)
    fun getTasks(): List<Task> {
        return tasks.values.toList()
    }
}